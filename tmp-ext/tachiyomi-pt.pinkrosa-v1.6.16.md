# Extension Validation Report

- Extension: tachiyomi-pt.pinkrosa-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8456404960509331854
- Source name: Pink Rosa
- Source language: pt-BR
- Selected manga input: popular offset 0: Katainaka no Ossan (`.../katainaka-no-ossan.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Katainaka no Ossan (`.../katainaka-no-ossan.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Katainaka no Ossan (`.../katainaka-no-ossan.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Katainaka no Ossan (`.../katainaka-no-ossan.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapter 01 (`.../cap-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Katainaka no Ossan, URL=`.../katainaka-no-ossan.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 171064 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../katainaka-no-ossan.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 422261 bytes, 1125x1600) |  |  |  |
| details author | PASS | Shigeru Sagasaki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Artes Marciais, Fantasia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | O Velho Espadachim do Campo: Ou a história de como meus excelentes discípulos não me abandonaram, eu um simples instrutor de espada do campo. Beryl Gardenant é um homem que dirige diligentemente um dojo de espada em uma vila rural. Para onde foi aquele espadachim cheio de sonhos de glória? Bem, hoje em dia ele vive se chamando de "velho inútil". "Acho que vou continuar vivendo uma vida tranquila e é isso." Um dia, enquanto vive sua vida despreocupada, ele é visitado por Alexia, uma de suas ex-discípulas que ascendeu à posição de cavaleira real. "O recomendei como instrutor especial para cavaleiros reais." "...O que?" Ainda surpreso com o que estava acontecendo, Beryl vai para a capital real, se encontrando com suas antigas discípulas, como a aventureira mais forte e uma maga rank S. Todas elas... implorando para ele ensiná-las novamente?! "Mas elas não precisam mais de mim..." Beryl continuou com sua autodepreciação. Com uma espada invencível que treinou durante anos, suas conquistas são elogiadas na capital, onde é conhecido como o "Espadachim do Campo". "Que tipo de título patético é esse?!" O "mestre" das discípulas mais fortes da história finalmente recebe sua recompensa. Uma fantasia sobre um velho "subindo ao topo"! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 83219 bytes, 800x900) |  |  |  |
