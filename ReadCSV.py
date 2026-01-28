import pandas as pd
df = pd.read_csv('employees.csv')
print(df)
# Get specific data
print("Only names")
print(df["Name"])

# only column
print(df[["Name","Sick Days remaining"]])

#only iloc
print(df.iloc[:,3:5])