package org.udesc.program.cashmate.entities;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Expense
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;
	private String description;
	private float price;
	@OneToOne
	private Tag tag;
	@OneToOne
	private MouthOfYears mouthOfYears;

	public Expense()
	{
		// TODO document why this constructor is empty
	}

	public Expense(Long id, String description, float price, Tag tag, MouthOfYears mouthOfYears)
	{
		this.id = id;
		this.description = description;
		this.price = price;
		this.tag = tag;
		this.mouthOfYears = mouthOfYears;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public Tag getTag()
	{
		return tag;
	}

	public void setTag(Tag tag)
	{
		this.tag = tag;
	}

	public MouthOfYears getMouthOfYears()
	{
		return mouthOfYears;
	}

	public void setMouthOfYears(MouthOfYears mouthOfYears)
	{
		this.mouthOfYears = mouthOfYears;
	}
}
