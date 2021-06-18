package com.company.Refactoritzacions_6.Substitute_algorithm;

public class Order {
	public float applyVAT (int vatType) {
		float[] result = {1.04f, 1.18f, 1.21f};

		if (vatType > 0 && vatType < 4) {
			return result[vatType];
		}
		return -1;

	}
}
