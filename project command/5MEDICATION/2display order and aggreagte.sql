---display all medication order by price desc
SELECT * FROM medication  ORDER BY med_price DESC;
--total number of medication
SELECT COUNT( med_id ) AS TotalNumbMedication FROM medication
--sum the of all mediction 
SELECT SUM( med_price ) AS TotalMedSum FROM medication