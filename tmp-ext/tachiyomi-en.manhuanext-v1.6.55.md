# Extension Validation Report

- Extension: tachiyomi-en.manhuanext-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3544957587727489204
- Source name: Manhuanext
- Source language: en
- Selected manga input: popular offset 0: The Yellow-Haired Villain in the Female Main Character’s Novel Wants Happiness (`.../1531`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Yellow-Haired Villain in the Female Main Character’s Novel Wants Happiness (`.../1531`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 7 | My Wife Is Actually The Demon Cult Leader (`.../2517`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Global Superpowers: Awakening the Purple Thunder at the Beginning (`.../1911`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 7 | Primal Hunter (`.../2379`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Yellow-Haired Villain in the Female Main Character’s Novel Wants Happiness (`.../1531`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | 1-10s |

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
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuanext.com/.../file_00000000beb0720aa6fdb12b85246107-700x1024-1-175x238.png` (image/png, 37296 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1531` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhuanext.com/.../file_00000000beb0720aa6fdb12b85246107-700x1024-1-193x278.png` (image/png, 45857 bytes, 193x278) |  |  |  |
| details author | PASS | You and I are not fish |  |  |  |
| details artist | PASS | SF Light Novels |  |  |  |
| details genres | PASS | Action, Adventure, Boys, Comedy, Drama, Fantasy, Fighting, Girls, Historical, Love, manhua, Superhero, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[From the Same Studio as the Manhua “Shut Up, Evil Dragon!”\]<br><br>Transmigrating into the body of a yellow-haired villain in the early stages of a Yuri novel, Moon only wants to survive. But… why does the story seem to be going off track?<br><br>The princess has already been drugged, and even her pants have been removed—so why hasn’t the protagonist appeared yet? Why does the protagonist’s childhood friend, a noble and pure saint, keep giving me flirtatious looks? Even my obedient and loyal personal maid has started gazing at me with increasingly dangerous eyes!<br><br>Where is the protagonist?! Please, someone save me!!<br><br>Alternative Names: 凤傲天小说里的黄毛反派也想幸福 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | LINT | 32 of 83 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=32 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhuanext.com/.../01.jpg` (image/jpeg, 32913 bytes, 800x1080) |  |  |  |
