function checkHealth() {
    const statusElement = document.getElementById('health-status');
    const patientId = document.getElementById('patient-id').value;

    if (patientId === '123') {  // Exemplo de ID para simulação
        statusElement.textContent = 'Paciente está saudável';
        statusElement.className = 'status status-ok';
    } else {
        statusElement.textContent = 'Paciente com sinais de doença';
        statusElement.className = 'status status-not-ok';
    }
    statusElement.style.display = 'block';
}