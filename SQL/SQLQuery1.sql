--Select
--ANSII
select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

select * from Customers where City = 'Berlin'

--case insensitive
select * from Products where CategoryID = 1 or CategoryID = 3

select * from Products where CategoryID = 1 and UnitPrice >= 10

select * from Products where CategoryID = 1

select * from Products where CategoryID = 1 order by UnitPrice asc

select * from Products where CategoryID = 1 order by UnitPrice desc

select count(*) from Products

select count(*) from Products where CategoryID = 2

select count(*) Adet from Products where CategoryID = 2

select CategoryID, count(*) Urun from Products group by CategoryID

select CategoryID, count(*) Urun from Products group by CategoryID having count(*) < 10

select CategoryID, count(*) Urun from Products where UnitPrice > 20 group by CategoryID having count(*) < 10

select * 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice > 10

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o 
on o.OrderID = od.OrderID