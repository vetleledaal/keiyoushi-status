# Extension Validation Report

- Extension: tachiyomi-ar.hentailek-v1.6.1
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1258840903039841012
- Source name: هنتاي ليك
- Source language: ar
- Selected manga input: latest offset 0: Yuri’s Part Time Job (`.../yu-ri-ui-arbeit`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | إدمان زوجة الأب (`.../addicted-to-my-stepmom`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Her Toy Shop (`.../seonginyongpumjeom-geunyeo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Yuri’s Part Time Job (`.../yu-ri-ui-arbeit`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Secret Lessons With My Younger Sister (`.../secret-lessons-with-my-younger-sister`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Yuri’s Part Time Job (`.../yu-ri-ui-arbeit`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yuri’s Part Time Job (`.../yu-ri-ui-arbeit`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 151 |  |  | <1s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yuri’s Part Time Job, URL=`.../yu-ri-ui-arbeit` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 24 manga entries; Popular page 2 repeats 18 manga entries; Latest page 1 repeats 24 manga entries; Latest page 2 repeats 18 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 170/170 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 170/170 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://0096423.xyz/.../cover-thumb.webp` (image/webp (encoding: lossy), 41744 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yu-ri-ui-arbeit` |  |  |  |
| details thumbnail URL | PASS | `https://0096423.xyz/.../cover-thumb.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama هنتاي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | مانها درامي للكبار من تأليف Studio Piri، يحكي قصة الطالبة الجامعية يو-ري التي تعيش حياة مزدوجة ليلاً حتى يكتشف أستاذها باك سر وظيفتها بدوام جزئي. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 151 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://0096423.xyz/.../001.webp` (image/webp (encoding: lossy), 12342 bytes, 720x564) |  |  |  |
