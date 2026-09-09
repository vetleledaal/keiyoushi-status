# Extension Validation Report

- Extension: tachiyomi-en.mangafox-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6484561431658238800
- Source name: MangaFox
- Source language: en
- Selected manga input: popular offset 0: A Story About Treating a Female Knight Who Has Never Been Treated as a Woman as a Woman (`.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 70 | A Story About Treating a Female Knight Who Has Never Been Treated as a Woman as a Woman (`.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 70 | Isekai Nonbiri Nouka (`.../isekai_nonbiri_nouka`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 70 | Antidote (Harusari) (`.../antidote_harusari`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 70 | Momoiro Meloik (`.../momoiro_meloik`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | A Story About Treating a Female Knight Who Has Never Been Treated as a Woman as a Woman (`.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Story About Treating a Female Knight Who Has Never Been Treated as a Woman as a Woman (`.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | Vol.01 Ch.001 - Knight and Confession (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Story About Treating a Female Knight Who Has Never Been Treated as a Woman as a Woman, URL=`.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 292/292 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 292/292 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fmcdn.mfcdn.net/.../cover.jpg <redacted query values: token, ttl, and v>` (image/jpeg, 45970 bytes, 200x284) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a_story_about_treating_a_female_knight_who_has_never_been_treated_as_a_woman_as_a_woman` |  |  |  |
| details thumbnail URL | PASS | `https://fmcdn.mfcdn.net/.../cover.jpg <redacted query values: token, ttl, and v>` |  |  |  |
| details author | PASS | MATSUMOTO Kengo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, Shounen, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Female knight Leo has never been treated as a woman...until the magician Fooly treats her as one. These two will challenge the quest named “Romance,“ which is tougher to complete than a super hard dungeon! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://zjcdn.mangafox.me/.../v001.jpg <redacted query values: token and ttl>` (image/jpeg, 199378 bytes, 650x933) |  |  |  |
