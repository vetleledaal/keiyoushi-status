# Extension Validation Report

- Extension: tachiyomi-es.yupmanga-v1.4.17
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

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
| popular | `fetchPopularManga(1)` | success | 22 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 36 | Psyren (`.../3A3MPTRKSWH1Q`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | La boda de las luciérnagas (`.../ERRWSG2EPHTF6`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Quiero ser destruida por mi novio bestia (`.../FN1ZQH66B6YQA`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Tomo - 01 (`.../j8tcuHFOf1lbNPSgYLyLiSwmhGJFJ9S8R5uuwlO9vxwundi-du7gToRdSYP-km6ENyGzBYm--HqzfD6DMMEJ`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quiero ser destruida por mi novio bestia, URL=`FN1ZQH66B6YQA` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 95/95 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 95/95 manga have thumbnail URLs |  |  |  |
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
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, token, and context>` (image/webp (encoding: lossy), 21532 bytes, 247x362) |  |  |  |
