# Extension Validation Report

- Extension: tachiyomi-all.hentai3-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 4
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.l
- Source ID: 7819216870104067677
- Source name: 3Hentai
- Source language: en
- Selected manga input: popular offset 0: 리그 오브 티모 - League of Teemo (`.../44680`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 리그 오브 티모 - League of Teemo (`.../44680`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Yokubari Saboten (`.../43092`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Lana's Mom Is a Nurse + a (`.../606403`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Alestia & Muddy Cherry Crossover IF Manga (`.../605069`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 리그 오브 티모 - League of Teemo (`.../63628`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 리그 오브 티모 - League of Teemo (`.../44680`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../44680`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=리그 오브 티모 - League of Teemo, URL=`.../44680` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s2.3hentai.net/.../thumb.jpg` (image/jpeg, 114134 bytes, 500x645) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../44680` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s2.3hentai.net/.../cover.jpg` (image/jpeg, 187387 bytes, 700x903) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Anal ♀, Big Breasts ♀, Defloration ◊, Drugs ♀, Fairy ♀, Femdom ◊, Furry ♂, Group ◊, Huge Breasts ♀, Impregnation ♀, Inverted Nipples ♀, Midget ♂, Mmf Threesome ◊, Muscle ♂, Ninja ◊, Pirate ♀, Rape ♀, Uncensored ◊ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Characters: Akali, Jax, Katarina Du Couteau, Sona Buvelle, Teemo, Miss Fortune \| Sarah Fortune<br><br>Series: League Of Legends<br><br>Languages: English, Translated<br><br>Pages: 57<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s2.3hentai.net/.../1.jpg` (image/jpeg, 245988 bytes, 800x1032) |  |  |  |
