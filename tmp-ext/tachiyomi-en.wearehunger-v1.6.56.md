# Extension Validation Report

- Extension: tachiyomi-en.wearehunger-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 58992897252080929
- Source name: KokoMangas
- Source language: en
- Selected manga input: popular offset 0: You Did It, Didn’t You!? (`.../123`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | You Did It, Didn’t You!? (`.../123`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Joudan de Onna Yuusha-tachi wo Kudoita Daimaou, Sarawarete Kyousei Shinkon Seikatsu (`.../156`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Having Sex with Someone Else in Front of You (`.../289`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Tenchi Mikoto wa Datenshi o Shiranai (`.../374`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | You Did It, Didn’t You!? (`.../123`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kokomangas.com/.../Gyarus.jpg` (image/jpeg, 1507832 bytes, 1115x1583) |  |  |  |
| details identity | PASS | Details preserved selected URL `123` |  |  |  |
| details thumbnail URL | PASS | `https://kokomangas.com/.../Gyarus.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hanamura, a high school boy who loves lewd girls more than anything. One day, he witnesses it!! The decisive moment when someone (♀) is masturbating right on top of his own desk…!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | 3 of 14 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kokomangas.com/.../Pg-de-Cr%C3%A9dito.jpg` (image/jpeg, 1402561 bytes, 1822x1435) |  |  |  |
