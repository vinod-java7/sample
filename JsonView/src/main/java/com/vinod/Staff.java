
package com.vinod;

import com.fasterxml.jackson.annotation.JsonView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Staff 
{
	 @JsonView(CompanyViews.Normal.class)
	    private String name;

	    @JsonView(CompanyViews.Normal.class)
	    private int age;

	    @JsonView(CompanyViews.Manager.class)
	    private String[] position;

	    @JsonView(CompanyViews.Manager.class)
	    private List<String> skills;

	    @JsonView(CompanyViews.Manager.class)
	    private Map<String, BigDecimal> salary;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String[] getPosition() {
			return position;
		}

		public void setPosition(String[] position) {
			this.position = position;
		}

		public List<String> getSkills() {
			return skills;
		}

		public void setSkills(List<String> skills) {
			this.skills = skills;
		}

		public Map<String, BigDecimal> getSalary() {
			return salary;
		}

		public void setSalary(Map<String, BigDecimal> salary) {
			this.salary = salary;
		}
	    
	    

}
