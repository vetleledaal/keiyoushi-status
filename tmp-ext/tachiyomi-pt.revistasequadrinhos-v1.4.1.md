# Extension Validation Report

- Extension: tachiyomi-pt.revistasequadrinhos-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 3
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1455091782657313638
- Source name: Revistas e Quadrinhos
- Source language: pt
- Selected manga input: latest offset 0: Hell Village – Micaela 10 por PigKing (`.../hell-village-micaela-10-por-pigking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Hell Village – Micaela 10 por PigKing (`.../hell-village-micaela-10-por-pigking`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hell Village – Micaela 10 por PigKing (`.../hell-village-micaela-10-por-pigking`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo Único (`.../hell-village-micaela-10-por-pigking`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 95 |  |  | <1s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 latest manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://revistasequadrinhos.com/.../capa-hell-village-micaela-10.webp` (image/webp (encoding: lossy), 17606 bytes, 248x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hell-village-micaela-10-por-pigking` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 3D-HQPORNO, Crazy-Dad3D, CrazyDad3D, HQ 3D, HQ ADULTO, PigKing, 3D-HQPORNO, Crazy-Dad3D, crazydad3d, HQ 3D, PigKing, Quadrinhos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 95 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://revistasequadrinhos.com/.../hell-village-micaela-parte-10-1.jpg` (image/jpeg, 349009 bytes, 2000x1126) |  |  |  |
