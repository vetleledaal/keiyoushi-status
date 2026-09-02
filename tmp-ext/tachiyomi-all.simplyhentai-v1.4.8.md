# Extension Validation Report

- Extension: tachiyomi-all.simplyhentai-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 4
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 298934354390867671
- Source name: Simply Hentai
- Source language: en
- Selected manga input: latest offset 0: Mama Mega captions 2022-2023 (`.../mama-mega-captions-2022-2023`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Luocha x Female MC x Blade Part 1 (`.../luocha-x-female-mc-x-blade-part-1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | How to XXX (`.../how-to-xxx`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Mama Mega captions 2022-2023 (`.../mama-mega-captions-2022-2023`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Peco-chan Muccha Kawaii yo ne (`.../peco-chan-muccha-kawaii-yo-ne`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mama Mega captions 2022-2023 (`.../mama-mega-captions-2022-2023`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mama Mega captions 2022-2023 (`.../mama-mega-captions-2022-2023`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../all-pages`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 173 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mama Mega captions 2022-2023, URL=`.../mama-mega-captions-2022-2023` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.sh-cdn.com/.../thumb_246c812a.jpg` (image/jpeg, 47611 bytes, 480x685) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mama-mega-captions-2022-2023` |  |  |  |
| details thumbnail URL | PASS | `https://images.sh-cdn.com/.../thumb_246c812a.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | BBW, caption, demon girl, Femdom, Futanari, Incest, Teen (18+), shotacon, Yandere |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Series: Original Work<br>Characters: astolfo, hayase nagatoro, hex maniac, ilulu, mitsuki bakugou |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 173 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.sh-cdn.com/.../246c812a.jpg` (image/jpeg, 152465 bytes, 1033x1508) |  |  |  |
