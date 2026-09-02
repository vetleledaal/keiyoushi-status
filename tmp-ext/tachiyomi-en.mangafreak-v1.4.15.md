# Extension Validation Report

- Extension: tachiyomi-en.mangafreak-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1201694572804778862
- Source name: Mangafreak
- Source language: en
- Selected manga input: latest offset 0: Haimiya Senpai Wa Kowakute KawaII (`.../Haimiya_Senpai_Wa_Kowakute_Kawaii`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | One Piece (`.../One_Piece`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Shingeki no Kyojin (`.../Shingeki_No_Kyojin`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 193 | Haimiya Senpai Wa Kowakute KawaII (`.../Haimiya_Senpai_Wa_Kowakute_Kawaii`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../Haimiya_Senpai_Wa_Kowakute_Kawaii`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Haimiya Senpai Wa Kowakute KawaII (`.../Haimiya_Senpai_Wa_Kowakute_Kawaii`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 41 | Chapter 1 (`.../Read1_Haimiya_Senpai_Wa_Kowakute_Kawaii_1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 193 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Haimiya-senpai wa Kowakute Kawaii, URL=`.../Haimiya_Senpai_Wa_Kowakute_Kawaii` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | FAIL | Invalid manga: popular entry 15: title=<blank>, URL=`.../Manga` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 224/224 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangafreak.me/.../haimiya_senpai_wa_kowakute_kawaii.jpg` (image/jpeg, 50168 bytes, 400x568) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Haimiya_Senpai_Wa_Kowakute_Kawaii` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangafreak.me/.../haimiya_senpai_wa_kowakute_kawaii.jpg` |  |  |  |
| details author | PASS | This is ON-GOING series |  |  |  |
| details artist | PASS | Type: Manga |  |  |  |
| details genres | PASS | Comedy, Drama, Romance, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | At my high school, Haimiya-senpai is known for being terrifying — her intimidating looks and blunt speech have earned her a reputation as someone to avoid. Add to that her sparkling piercings, striking long gray wolf-cut hair, and a Kansai accent, and it’s easy to see why she’s considered so scary. But surprisingly, this "scary" senpai has been nothing but kind to me. As her tough exterior gives way to a softer side, the line between "scary" and "cute" starts to blur. And so begins the heart-pounding, rom-com journey with my intimidating, yet adorable, senpai! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.mangafreak.me/.../haimiya_senpai_wa_kowakute_kawaii_1_1.jpg` (image/jpeg, 220087 bytes, 800x1138) |  |  |  |
