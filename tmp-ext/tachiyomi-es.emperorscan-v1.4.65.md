# Extension Validation Report

- Extension: tachiyomi-es.emperorscan-v1.4.65
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4562754350961964148
- Source name: Emperor Scan
- Source language: es
- Selected manga input: popular offset 0: el Apariencias (`.../hdjksd-78hf`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | el Apariencias (`.../hdjksd-78hf`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | El renacimiento del dios supremo del fisico (`.../el-renacimiento-del-dios-supremo-del-fisico`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Combat Continent IV (`.../combat-continent-iv`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Magníficamente monstruoso (`.../jyzq6wog9ok4yiz`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | el Apariencias (`.../hdjksd-78hf`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | el Apariencias (`.../hdjksd-78hf`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 628 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=el Apariencias, URL=`.../hdjksd-78hf` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imperiomanhua.com/.../loook.jpg` (image/jpeg, 214871 bytes, 1000x1399) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hdjksd-78hf` |  |  |  |
| details thumbnail URL | PASS | `https://imperiomanhua.com/.../loook.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Artes marciales, Comedia, Drama, Manhwa, Romance, Vida escolar, Webtoon, Meraki Scans |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Daniel es un solitario poco atractivo que se despierta en un cuerpo diferente. Ahora alto, guapo y más genial que nunca en su nueva forma. Daniel aspira a lograr todo lo que no pudo antes. ¿Hasta dónde llegará conservar su cuerpo… y sus secretos? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 628 chapters |  |  |  |
| chapter dates | PASS | 628 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imperiomanhua.com/.../01.jpg` (image/jpeg, 1135656 bytes, 720x13900) |  |  |  |
