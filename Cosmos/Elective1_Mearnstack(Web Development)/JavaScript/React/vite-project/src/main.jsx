import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import "./global.css"
import CosmosApp from './CosmosApp.jsx'
import { BrowserRouter } from "react-router-dom"

createRoot(document.getElementById('root')).render(
  <StrictMode>
{/*     <App /> */}
<BrowserRouter>
<CosmosApp> </CosmosApp>
</BrowserRouter>

  </StrictMode>,
)
