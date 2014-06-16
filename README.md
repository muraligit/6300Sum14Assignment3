6300Sum14Assignment3
====================
NAME
-
	Unitconverter
	
SYNOPSIS
-
	Android Application for converting units.
	
DESCRIPTION
-
	Unitconverter will take any decimal input and convert the number to units selected.  
	Length, Temperature,and Weightconversions are allowed.

USAGE
-
	  The launcher screen will allow user to select the conversion type required. After 
	  selecting the conversion type use clicks the 'Go' button at the bottom.  This will 
	  launch the specific conversion screen.  This screen will take a decimal input and 
	  provide two radio buttons with two units.  User can select the unit to which the 
	  input should be converted to. The user can toggle between the units with the input 
	  value toggling to the unit selected.  A home button at the bootom allows the user to 
	  return to main(launcher) screen where the user can select one the of the three
	  conversion options again.

UNITS	
-

	- LENGTH
		User can convert between Miles and Kilometers

	- TEMPERATURE
		User can convert between Fahrenheit and Celsius 
	
	- WEIGHT
		User can convert between Pounds and Kilograms

DESIGN
-
	  All choices are implemeted using Radiobuttons.  Switching between activites is 
	  implemeted using button clicks at the bottom of each screen.  The switching is 
	  implemented by launching the conversion activity when in launcher screen. 
	  The switching is implemented by calling the back press function of android when 
	  in a conversion screen.  To switch between two conversion user has to go to the 
	  other screen via the home screen.

