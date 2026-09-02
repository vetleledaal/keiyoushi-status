# Extension Validation Report

- Extension: tachiyomi-es.emperorscan-v1.4.65
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4562754350961964148
- Source name: Emperor Scan
- Source language: es
- Selected manga input: latest offset 0: Trastorno del estado de ánimo (`.../wgo9iwfkrlkelhf`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | el Apariencias (`.../hdjksd-78hf`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | El renacimiento del dios supremo del fisico (`.../el-renacimiento-del-dios-supremo-del-fisico`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Trastorno del estado de ánimo (`.../wgo9iwfkrlkelhf`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Chamán del dinero (`.../ch4m4n-d3l-d1er0`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Trastorno del estado de ánimo (`.../wgo9iwfkrlkelhf`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Trastorno del estado de ánimo (`.../wgo9iwfkrlkelhf`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 60 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Trastorno del estado de ánimo, URL=`.../wgo9iwfkrlkelhf` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Malformed manga URLs: latest_next entry 12: `.../el-pfewo-lfewde-de-la-mansia%C2%93n-del-dew` contains control characters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imperiomanhua.com/.../mood-disorder.webp` (image/webp (encoding: lossy), 363198 bytes, 840x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wgo9iwfkrlkelhf` |  |  |  |
| details thumbnail URL | PASS | `https://imperiomanhua.com/.../mood-disorder.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Drama, Shounen, Sobrenatural, Terror |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Todos están locos menos yo. Pero, ¿es una desgracia estar cuerdo en un mundo de locos? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imperiomanhua.com/.../001.webp` (image/webp (encoding: lossy), 369410 bytes, 900x4500) |  |  |  |
