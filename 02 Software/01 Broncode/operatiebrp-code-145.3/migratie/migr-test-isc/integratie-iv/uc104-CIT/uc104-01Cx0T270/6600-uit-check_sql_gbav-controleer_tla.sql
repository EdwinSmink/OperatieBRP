SELECT COUNT(*) AS aantal_tla
FROM initvul.initvullingresult_protocollering
WHERE toeganglevsautorisatie_id=(SELECT id 
FROM autaut.toeganglevsautorisatie WHERE levsautorisatie=(SELECT id FROM autaut.levsautorisatie WHERE naam='510221' AND datingang='20130101' AND dateinde='20150102')) 
OR
toeganglevsautorisatie_id=(SELECT id 
FROM autaut.toeganglevsautorisatie WHERE levsautorisatie=(SELECT id FROM autaut.levsautorisatie WHERE naam='510001' AND datingang='20130101' AND dateinde='20150103'));