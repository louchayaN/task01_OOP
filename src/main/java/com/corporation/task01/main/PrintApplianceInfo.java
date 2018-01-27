package com.corporation.task01.main;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Laptop;
import com.corporation.task01.entity.Oven;
import com.corporation.task01.entity.Refrigerator;
import com.corporation.task01.entity.Speakers;
import com.corporation.task01.entity.TabletPC;
import com.corporation.task01.entity.VacuumCleaner;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {

		if (appliance instanceof Oven) {
			Oven oven = (Oven) appliance;
			System.out.printf(
					"Appliance Type: oven. Parametres: powerConsumption=%s,  weight=%s, capacity=%s, depth=%s, height=%s, width=%s%n",
					oven.getPowerConsumtion(), oven.getWeight(), oven.getCapacity(), oven.getDepth(), oven.getHeight(), oven.getWidth());
		}

		if (appliance instanceof Laptop) {
			Laptop laptop = (Laptop) appliance;
			System.out.printf(
					"Appliance Type: laptop. Parametres: battery Capacity=%s, os=%s, memory Rom=%s, system Memory=%s, cpu=%s, display in inches=%s%n",
					laptop.getBatteryCapacity(), laptop.getOs(), laptop.getOs(), laptop.getMemoryRom(), laptop.getSystemMemory(),
					laptop.getCpu(), laptop.getDisplayInchs());
		}

		if (appliance instanceof Refrigerator) {
			Refrigerator refrigerator = (Refrigerator) appliance;
			System.out.printf(
					"Appliance Type: refrigerator. Parametres: power consumption=%s, weight=%s, freezer capacity=%s, overall capacity=%s, height=%s, width=%s%n",
					refrigerator.getPowerConsumption(), refrigerator.getWeight(), refrigerator.getFreezerCapacity(),
					refrigerator.getOverallCapacity(), refrigerator.getHeight(), refrigerator.getWidth());
		}

		if (appliance instanceof VacuumCleaner) {
			VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
			System.out.printf(
					"Appliance Type: vacuum cleaner. Parametres: power consumption=%s, filter type=%s, bag type=%s, wand type=%s, motor speed regulation=%s, cleaning width=%s%n",
					vacuumCleaner.getPowerConsumption(), vacuumCleaner.getFilterType(), vacuumCleaner.getBagType(),
					vacuumCleaner.getWandType(), vacuumCleaner.getMotorSpeedRegulation(), vacuumCleaner.getCleaningWidth());
		}

		if (appliance instanceof TabletPC) {
			TabletPC tabletPC = (TabletPC) appliance;
			System.out.printf(
					"Appliance Type: tablet PC. Parametres: battery capacity=%s, display inches=%s, memory Rom=%s, flash memory capacity=%s, color=%s%n",
					tabletPC.getBatteryCapacity(), tabletPC.getDisplayInches(), tabletPC.getMemoryRom(), tabletPC.getFlashMemoryCapacity(),
					tabletPC.getColor());
		}

		if (appliance instanceof Speakers) {
			Speakers speakers = (Speakers) appliance;
			System.out.printf(
					"Appliance Type: speakers. Parametres: power consumption=%s, number of speakers=%s, frequency range=%s, cord length=%s%n",
					speakers.getPowerConsumption(), speakers.getNumberOfSpeakers(), speakers.getFrequencyRange(), speakers.getCordLength());
		}
	}

}
