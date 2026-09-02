# Extension Validation Report

- Extension: tachiyomi-pt.onereader-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5026351287650198434
- Source name: OneReader
- Source language: pt-BR
- Selected manga input: popular offset 0: "O Herói", Dirigido Pelo Rei Demônio (`.../o-heroi-dirigido-pelo-rei-demonio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | "O Herói", Dirigido Pelo Rei Demônio (`.../o-heroi-dirigido-pelo-rei-demonio`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | A Ascensão do Supremo Demônio Celestial (`.../a-ascensao-do-supremo-demonio-celestial`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Guarda Malandro em uma Fantasia Medieval (`.../guarda-malandro-em-uma-fantasia-medieval`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | "O Herói", Dirigido Pelo Rei Demônio (`.../o-heroi-dirigido-pelo-rei-demonio`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | "O Herói", Dirigido Pelo Rei Demônio (`.../o-heroi-dirigido-pelo-rei-demonio`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title="O Herói", Dirigido Pelo Rei Demônio, URL=`o-heroi-dirigido-pelo-rei-demonio` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://b2.onereader.net/.../o-heroi-dirigido-pelo-rei-demonio-1783451460936` (image/webp (encoding: lossy), 73300 bytes, 720x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `o-heroi-dirigido-pelo-rei-demonio` |  |  |  |
| details thumbnail URL | PASS | `https://b2.onereader.net/.../o-heroi-dirigido-pelo-rei-demonio-1783451460936` |  |  |  |
| details author | PASS | Heetto |  |  |  |
| details artist | PASS | Heetto |  |  |  |
| details genres | PASS | Comédia, Demônios, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Krad, o temido Rei Demônio que passou milhares de anos esperando por um herói digno, acaba encontrando uma nova fonte de entretenimento: a cultura pop humana. Agora, o ser capaz de destruir o mundo está mais interessado em sua nova obsessão do que em batalhas.<br><br>Título original: The Hero Directed by the Demon King<br>Título nativo: 용사 출연 마왕 연출<br>Tipo: Webtoon<br>País: Coreia<br>Ano: 2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://b2.onereader.net/.../1.webp` (image/webp (container: extended), 574674 bytes, 800x14445) |  |  |  |
