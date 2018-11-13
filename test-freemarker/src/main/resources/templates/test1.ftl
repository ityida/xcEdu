<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>hello world</title>
</head>
<body>
Hello ${name}!
<br/>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>钱包</td>
        <td>日期</td>
    </tr>
<#list stus as stu>
    <tr>
        <td>${stu_index + 1}</td>
        <td <#if stu.name =='小明'>style="background:red;"</#if>>${stu.name}</td>
        <td>${stu.age}</td>
        <td <#if (stu.mondy > 1000)>style="background:green;"</#if>>${stu.mondy}</td>
        <td>${(stu.birthday?date)!""}</td>
    </tr>
</#list>


</table>
<br/><br/>
输出stu1的学生信息：<br/>
姓名：${stuMap['stu1'].name}<br/>
年龄：${stuMap['stu1'].age}<br/>
输出stu1的学生信息：<br/>
姓名：${stu1.name}<br/>
年龄：${stu1.age}<br/>
遍历输出两个学生信息：<br/>
<table>
    <tr>
        <td>序1号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>钱包</td>
    </tr>
<#list stuMap?keys as k>
    <tr>
        <td>${k_index + 1}</td>
        <td>${stuMap[k].name}</td>
        <td>${stuMap[k].age}</td>
        <td >${stuMap[k].mondy}</td>
    </tr>
</#list>
</table>

${point?c}
<br/>
<#assign text="{'bank':'工商银行','account':'1010121219202019202120000'}" />
<#assign data=text?eval />
开户行：${data.bank}  账号：${data.account}

</body>
</html>