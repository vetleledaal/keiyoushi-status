# Extension Validation Report

- Extension: tachiyomi-es.dynasty-v1.4.1
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
- Source ID: 1788469981763672104
- Source name: Dynasty
- Source language: es
- Selected manga input: popular offset 0: Alfa Insignificante (`.../308%7Calfa-insignificante`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Alfa Insignificante (`.../308%7Calfa-insignificante`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 19 | El mercenario regresado tiene un plan (`.../378%7Cel-mercenario-regresado-tiene-un-plan`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Alfa Insignificante (`.../308%7Calfa-insignificante`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 | Los machos del cuarto de cria (`.../363%7Clos-machos-del-cuarto-de-cria`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Alfa Insignificante (`.../308%7Calfa-insignificante`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Alfa Insignificante (`.../308%7Calfa-insignificante`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | Capítulo 1 (`.../137124`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Alfa Insignificante, URL=`308\|alfa-insignificante` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and URLs; 75 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manhuako.net/.../cover-1785160404700.webp` (image/webp (encoding: lossy), 31614 bytes, 315x415) |  |  |  |
| details identity | PASS | Details preserved selected URL `308\|alfa-insignificante` |  |  |  |
| details thumbnail URL | PASS | `https://img.manhuako.net/.../cover-1785160404700.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Dowon, un Alfa que busca un encuentro casual, ve a un Omega llorando dulcemente en un bar. Lleno de anticipación por su agradable aroma a feromonas y su encanto, Dowon descubre que el aparentemente lamentable Omega de repente reacciona de forma agresiva y lo somete. «Dije que tuviéramos un encuentro íntimo, no que me dominarías. El que va a ser dominado eres tú». |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhuako.net/.../001.webp` (image/webp (encoding: lossy), 1347252 bytes, 720x14715) |  |  |  |
