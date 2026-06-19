/*
  GccApplication2.c
 
 Created: 2/1/2026 11:11:21 AM
 Author : Oshan Bajracharya
  Roll_No : 230328
 */ 
 
#define F_CPU 8000000UL
#include <avr/io.h>
#include <util/delay.h>

/* 7-seg codes for common cathode */
const uint8_t seg[10] = {
	0x3F, // 0
	0x06, // 1
	0x5B, // 2
	0x4F, // 3
	0x66, // 4
	0x6D, // 5
	0x7D, // 6
	0x07, // 7
	0x7F, // 8
	0x6F  // 9
};

uint8_t min = 0, sec = 0;

void display(uint8_t d0, uint8_t d1, uint8_t d2, uint8_t d3)
{
	// Minute tens
	PORTD = 0xFF;
	PORTC = seg[d0];
	PORTD &= ~(1 << PD0);
	_delay_ms(2);

	// Minute units
	PORTD = 0xFF;
	PORTC = seg[d1];
	PORTD &= ~(1 << PD1);
	_delay_ms(2);

	// Second tens
	PORTD = 0xFF;
	PORTC = seg[d2];
	PORTD &= ~(1 << PD2);
	_delay_ms(2);

	// Second units
	PORTD = 0xFF;
	PORTC = seg[d3];
	PORTD &= ~(1 << PD3);
	_delay_ms(2);
}

int main(void)
{
	DDRC = 0xFF;   // segments
	DDRD = 0x0F;   // PD0–PD3 digit enable

	uint8_t mt, mu, st, su;

	while (1)
	{
		// extract digits
		mt = min / 10;
		mu = min % 10;
		st = sec / 10;
		su = sec % 10;

		// show for ~1 second
		for (uint16_t i = 0; i < 10; i++)
		{
			display(mt, mu, st, su);
		}

		// increment time
		sec++;
		if (sec == 60)
		{
			sec = 0;
			min++;
			if (min == 60)
			{
				min = 0;   // reset at 59:59 ? 00:00
			}
		}
	}
}