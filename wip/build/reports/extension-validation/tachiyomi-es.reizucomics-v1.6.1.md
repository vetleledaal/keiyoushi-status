# Extension Validation Report

- Extension: tachiyomi-es.reizucomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1524441003627325028
- Source name: Reizu Comics
- Source language: es
- Selected manga input: popular offset 0: Emparejar (`.../294a79ff-564e-452f-85e5-6f70f3099eec`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Emparejar (`.../294a79ff-564e-452f-85e5-6f70f3099eec`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | SLAM! (`.../6f7e7157-8e92-44df-a264-8708a727c0ee`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Cómplices (`.../194abe2b-9b50-4e93-84ca-cbf30c5b6218`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | SUSPIROS EFÍMEROS (`.../e7293c13-7e70-4e96-9cf3-7e544ef20d2e`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Emparejar (`.../294a79ff-564e-452f-85e5-6f70f3099eec`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Emparejar (`.../294a79ff-564e-452f-85e5-6f70f3099eec`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 47 | Capítulo 1: ¡VOY TARDE! (`.../1c987996-23f3-4e2b-98c0-e4f2339b5f63`) |  | <1s |
| pages | `getPageList(chapter)` | success | 90 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Emparejar, URL=`294a79ff-564e-452f-85e5-6f70f3099eec` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.reizucomics.com/.../1764622347576-featured_S41zdBkS-1000016163.webp` (image/webp (encoding: lossy), 46726 bytes, 530x602) |  |  |  |
| details identity | PASS | Details preserved selected URL `294a79ff-564e-452f-85e5-6f70f3099eec` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.reizucomics.com/.../1764622347576-featured_S41zdBkS-1000016163.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | COMEDIA, ROMANCE |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En el ordinario entorno escolar de Cristian, un joven que cursa su último año escolar con sus amigos Nando y Rico, todo marcha como de costumbre. Sin embargo, Nando lo presiona para que busque una relación sentimental con alguien, a pesar de que Cristian no está interesado en el tema. Pero su vida dará un giro cuando una compañera de clases revela un misterioso libro que aparentemente empareja a las personas escritas en él. ¿Conocerá Cristian el amor? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 10 name, chapter 13 name |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 90 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.reizucomics.com/.../1764639328435-CapR1-prt1_01.webp` (image/webp (container: extended), 67152 bytes, 800x1280) |  |  |  |
