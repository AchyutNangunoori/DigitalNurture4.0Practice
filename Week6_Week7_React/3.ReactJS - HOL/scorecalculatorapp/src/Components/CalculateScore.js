import "../Stylesheets/mystyle.css";

const percenttoDecimal = (decimal) => {
    return decimal.toFixed(2)+'%';
}

const calcscore = (total,goal) => {
    return percenttoDecimal(total/goal);
}

export const CalculateScore = ({Name, School, Total, Goal}) => {
    return(
    <div class="formatstyle">
        <h1 styel={{color:"Brown"}}>Student Details</h1>
        <div class="Name">
            <b> <span> Name </span></b>
            <span>{Name}</span>
        </div>
        <div class="School">
            <b> <span> School </span></b>
            <span>{School}</span>
        </div>
        <div class="Total">
            <b> <span> Total </span></b>
            <span>{Total}</span>
            <span> Marks </span>
        </div>
        <div class="Score">
            <b> Score </b>
            <span> {
                calcscore(Total,Goal)
            }</span>
        </div>
    </div>);
}