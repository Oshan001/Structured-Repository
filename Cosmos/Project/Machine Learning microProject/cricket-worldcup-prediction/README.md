# ICC Cricket World Cup — Match Winner Prediction

Binary classification project: predict whether **Team 1** wins a Men's Cricket World Cup ODI.

Data comes from [Cricsheet](https://cricsheet.org/) (`icc_mens_cricket_world_cup_json.zip` — 265 JSON files, **257 completed matches**, World Cups **2003–2023**). Older editions are partially withheld on Cricsheet.

## Project layout

```
cricket-worldcup-prediction/
├── data/raw/matches.csv              # parsed match records
├── data/processed/matches_clean.csv  # cleaned + engineered features
├── notebooks/match_winner_prediction.ipynb
├── models/best_model.pkl
├── reports/figures/                  # EDA + evaluation plots
├── reports/technical_report.docx
├── run_pipeline.py                   # one-shot script (same logic as notebook)
├── requirements.txt
└── README.md
```

## Setup

```bash
cd cricket-worldcup-prediction
python -m venv venv

# Windows
venv\Scripts\activate

pip install -r requirements.txt
```

## Run the pipeline

**Option A — script (fastest):**

```bash
python run_pipeline.py
```

**Option B — notebook:**

```bash
jupyter notebook notebooks/match_winner_prediction.ipynb
```

Run all cells top to bottom. The notebook reads/writes the same files as the script.

## What the model uses

Pre-match features only (no score leakage):

- Rolling win % for each team
- Head-to-head win rate
- Venue win rates
- Toss winner / decision
- Year, team names, venue (encoded)

Train/test split: **80/20 stratified**. Models compared: Logistic Regression, Random Forest, XGBoost.

## Outputs

After running, check:

- `reports/figures/` — EDA charts, confusion matrix, ROC, feature importance
- `models/best_model.pkl` — saved sklearn pipeline
- `reports/technical_report.docx` — 5–6 page write-up

## Load saved model

```python
import joblib
bundle = joblib.load("models/best_model.pkl")
pipe = bundle["pipeline"]
print(bundle["model_name"], bundle["metrics"])
```

## Notes

- Local project only — not pushed to GitHub.
- If Cricsheet download fails, re-run later or place a CSV manually in `data/raw/`.
- Assignment PDF was not found in the workspace; structure follows standard ML micro-project expectations.
