# Extension Validation Report

- Extension: tachiyomi-es.yupmanga-v1.4.17
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4437245120973625796
- Source name: Yupmanga
- Source language: es
- Selected manga input: popular offset 0: Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 36 | El amor de Tamao (`.../9EOOO4WQ22F24`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | Happyland (`.../L9QWX0H2Z17U0`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Tomo - 01 (`.../lGFCNEMZEL17lJxG6hGG2UwDVM9KFDYbmsmYO27MRYJss6oqV8fCZE4fq_Kjh0wmtsY594qEr1EjWdfyXu2-`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quiero ser destruida por mi novio bestia, URL=`FN1ZQH66B6YQA` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` (image/webp (encoding: lossy), 21532 bytes, 247x362) |  |  |  |
| details identity | PASS | Details preserved selected URL `FN1ZQH66B6YQA` |  |  |  |
| details thumbnail URL | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasía, Josei, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | La sanadora Rihanna guarda un deseo que no se atreve a confesar: que su novio, el hombre lobo Gilly —gladiador invicto—, la abrace con toda su fuerza y la «rompa» de placer. Él, consciente del abismo de poder entre un hombre bestia y una humana, la trata como un tesoro frágil… y ella vive atormentada. Cuando Rihanna prueba a provocar sus celos, despierta en Gilly un instinto mucho más salvaje del que imaginaba. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
