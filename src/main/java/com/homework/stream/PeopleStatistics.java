package com.homework.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PeopleStatistics {

	private List<Person> persons = Arrays.asList(
			new Person("Peter Parker", 130),
			new Person("Pumped Gabó", 50),
			new Person("Muhhamad Ali", 78),
			new Person("Shakira", 140),
			new Person("VV Pandora", 50),
			new Person("Bill Gates", 160));

	public IntSummaryStatistics getSummaryStatistic() {

		return persons.stream().collect(Collectors.summarizingInt(f -> f.iq));

		// System.out.println(iqSummary);
	}

	public String getPersonsWithHighIQ() {

		return persons.stream().
				filter(f -> f.iq > 100)
				.map(f -> f.name)
				.collect(Collectors.joining(" and ", "In this list ", " have IQ level above 100."));
		// System.out.println(text);
	}

	public Map<Integer, String> mapThePeople() {

		return persons.stream()
				.collect(Collectors.toMap(p -> p.iq,
						p -> p.name,
						(name1, name2) -> name1 + ";" + name2));
	}

}
