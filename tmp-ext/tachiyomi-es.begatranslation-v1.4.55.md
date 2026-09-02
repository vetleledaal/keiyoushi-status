# Extension Validation Report

- Extension: tachiyomi-es.begatranslation-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6757330205319558057
- Source name: Bega Translation
- Source language: es
- Selected manga input: popular offset 0: Un cambio en mi vida: Tras ser engañado y acusado falsamente de un delito, la chica más hermosa de la escuela se vuelve cercana a mí (`.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Un cambio en mi vida: Tras ser engañado y acusado falsamente de un delito, la chica más hermosa de la escuela se vuelve cercana a mí (`.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Viviendo con una diosa fría, terminé malcriándola tanto que se volvió un poco torpe (`.../cool-na-megami-sama-to-issho-ni-sundara-amayakashisugite-ponkotsu-ni-shite-shimatta-ken-ni-tsuite`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Aprendiendo a amar a mi compañera de clase felina (`.../aprendiendo-a-amar-a-mi-companera-de-clase-felina`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Adicto a Lilim (`.../adicto-a-lilim`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Un cambio en mi vida: Tras ser engañado y acusado falsamente de un delito, la chica más hermosa de la escuela se vuelve cercana a mí (`.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Un cambio en mi vida: Tras ser engañado y acusado falsamente de un delito, la chica más hermosa de la escuela se vuelve cercana a mí (`.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 18 | Capítulo 0 (`https://begatranslation.com/.../capitulo-0 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Un cambio en mi vida: Tras ser engañado y acusado falsamente de un delito, la chica más hermosa de la escuela se vuelve cercana a mí, URL=`.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://begatranslation.com/.../e6b97d04-c912-4ff4-9533-90ff0fd43a6e.webp` (image/webp (container: extended), 2431170 bytes, 1800x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../un-cambio-en-mi-vida-tras-ser-enganado-y-acusado-falsamente-de-un-delito-la-chica-mas-hermosa-de-la-escuela-se-vuelve-cercana-a-mi` |  |  |  |
| details thumbnail URL | PASS | `https://begatranslation.com/.../e6b97d04-c912-4ff4-9533-90ff0fd43a6e.webp` |  |  |  |
| details author | PASS | D |  |  |  |
| details artist | PASS | Ikagucheie |  |  |  |
| details genres | PASS | Comedy, Psychological, Romance, School Life, Seinen, Slice of Life, Publicándose |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A Eiji le hicieron NTR, con el as del equipo de futbol de su preparatoria. Luego de eso, Kondo (el netoreador) divulgó el falso rumor de que Eiji maltrataba a Miyuki (la infiel), eso ocasionó que, tanto en la escuela como en las redes sociales, Eiji sufriera un cuadro de bulling constante. Fue tanto el acoso que llegaron a amenazar de destruir el negocio de su madre soltera y hermano mayor, si es que no abandonaba la escuela, lo cual lo sumió en una desesperación, empujándolo a tomar la decisión de “apagarse”. Cuando llegó a la azotea de la escuela, se encontró con Ai, la chica mas hermosa de la preparatoria con una mirada vacía y a punto de hacer lo mismo que él. Tras ese encuentro ambos deciden avanzar para lo cual deberán de enfrentarse con diversas dificultades mientras curan sus heridas mutuamente.<br><br>Nombres Alternativos: Jinsei Gyakuten Uwaki sare, Enzai wo Kiserareta Ore ga, Gakuen Ichi no Bishoujo ni Natsuka reru |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | LINT | 1 of 18 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 18 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://begatranslation.com/.../00.1.webp` (image/webp (container: extended), 1561622 bytes, 2461x1378) |  |  |  |
