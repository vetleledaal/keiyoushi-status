# Extension Validation Report

- Extension: tachiyomi-pt.astratoons-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 551908063793499841
- Source name: Astratoons
- Source language: pt-BR
- Selected manga input: latest offset 0: A Regressão do Terceiro Príncipe do Reino Caído (`.../a-regressao-do-terceiro-principe-do-reino-caido`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Aparências (`.../aparencias`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | A Regressão do Terceiro Príncipe do Reino Caído (`.../a-regressao-do-terceiro-principe-do-reino-caido`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Veletric (`.../veletric`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Regressão do Terceiro Príncipe do Reino Caído (`.../a-regressao-do-terceiro-principe-do-reino-caido`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Regressão do Terceiro Príncipe do Reino Caído (`.../a-regressao-do-terceiro-principe-do-reino-caido`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 74 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Regressão do Terceiro Príncipe do Reino Caído, URL=`.../a-regressao-do-terceiro-principe-do-reino-caido` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://new.astratoons.com/.../01KBB3WNDP2SGF8ZAJV9T5N4JS.webp` (image/webp (encoding: lossy), 154934 bytes, 860x1161) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-regressao-do-terceiro-principe-do-reino-caido` |  |  |  |
| details thumbnail URL | PASS | `https://new.astratoons.com/.../01KBB3WNDP2SGF8ZAJV9T5N4JS.webp` |  |  |  |
| details author | PASS | 이정민 |  |  |  |
| details artist | PASS | 이정민 |  |  |  |
| details genres | PASS | Aventura, Ação, Fantasia, shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | LINT | All 74 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=74 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://new.astratoons.com/.../00b4826c-ae65-4bc1-9845-36230cfedbee.jpg` (image/jpeg, 187607 bytes, 800x1471) |  |  |  |
