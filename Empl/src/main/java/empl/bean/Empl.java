



package empl.bean;

import java.util.Date;

public class Empl {

    private Long id;
   private Date hired;
    private String name;
   
    private int salary;
    public Empl() {
    }
    

	public Empl(Long id, Date hired,String name, int salary) {
		//super();
		this.id = id;
		this.hired = hired;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHired() {
		return hired;
	}

	public void setHired(Date hired) {
		this.hired = hired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

   /* public City() {
    }

    public City(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + 
                ", population=" + population + '}';
    }*/
}