package org.jsp.Zorvyn_Assignment.model;

import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class FinancialRecord {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
        @NotNull
	    private Double amount;

	    @Enumerated(EnumType.STRING)
	    private RecordType type;

	    private String category;
        @NotNull
	    private LocalDate date;

	    private String description;
        @NotNull
	    private Long createdBy;

		public FinancialRecord( Double amount, RecordType type, String category, LocalDate date,
				String description, Long createdBy) {
			super();
		
			this.amount = amount;
			this.type = type;
			this.category = category;
			this.date = date;
			this.description = description;
			this.createdBy = createdBy;
		}

		
		
		 
		public FinancialRecord() {
			super();
		}




		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public RecordType getType() {
			return type;
		}

		public void setType(RecordType type) {
			this.type = type;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Long createdBy) {
			this.createdBy = createdBy;
		}
	    
	    
	    
	}


