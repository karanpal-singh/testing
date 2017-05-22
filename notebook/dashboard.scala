// Databricks notebook source
val df = sql("select * from adult")

// COMMAND ----------

display(df)

// COMMAND ----------

// MAGIC %sh ls "/dbfs/user/hive/warehouse"

// COMMAND ----------

display(dbutils.fs.ls("/user/hive/warehouse/"))

// COMMAND ----------

