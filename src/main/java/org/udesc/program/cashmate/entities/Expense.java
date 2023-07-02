package org.udesc.program.cashmate.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Expense
{
	@Id
	private String id;
	private String description;
	private float price;
	private Tag tag;
	private MouthOfYears mouthOfYears;

	public Expense()
	{
	}

	public Expense(String description, float price, Tag tag, MouthOfYears mouthOfYears)
	{
		this.description = description;
		this.price = price;
		this.tag = tag;
		this.mouthOfYears = mouthOfYears;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
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
