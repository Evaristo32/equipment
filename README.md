#EQUIPMENT

COMO CRIAR UM CONTAINER DO DOCKER PARA RODAR O BANCO DE DADOS POSTGRES

BAIXANDO A IMAGEM DO POSTGRES : docker pull postgres

EXECUTANDO O CONTAINER: docker run --name equipmentDb -e POSTGRES_DB=equipmentDb -e POSTGRES_USER=equipment -e POSTGRES_PASSWORD=equipment2023 -p5436:5432 -d postgres


EXECUTAR O SEGUINTE INSERT NA BASE DE DADOS PARA TESTAR O ENDPOINT:
INSERT INTO equipment.tb_equipment_type
(id, description, "name")
VALUES(nextval('equipment.sq_equipment'), 'Equipamentos eletronicos', 'Eletronico');