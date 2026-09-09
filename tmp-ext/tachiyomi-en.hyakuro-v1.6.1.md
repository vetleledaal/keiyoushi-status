# Extension Validation Report

- Extension: tachiyomi-en.hyakuro-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4981643024311726529
- Source name: Hyakuro Translations
- Source language: en
- Selected manga input: popular offset 0:  Chou Kasoku Ningen Leo (`.../chou-kasoku-ningen-leo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 |  Chou Kasoku Ningen Leo (`.../chou-kasoku-ningen-leo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Flowers Anthology 5: Himitsu Romantica (`.../flowers-anthology-5-himitsu-romantica`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Exiled Cheating Magician Enjoys a Carefree Second Life. ~I can Grant “Reinforcement Points” Not Only to Weapons, But to Anything, and I Can Revoke the Effects at Any Time I Choose. But Are Those Left Behind Okay?~ (`.../the-exiled-cheating-magician-enjoys-a-carefree-second-life-i-can-grant-reinforcement-points-not-only-to-weapons-but-to-anything-and-i-can-revoke-the-effects-at-any-time-i-choose-but-are-those-left-behind-okay`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Eyeshield 21: Brain x Brave (`.../eyeshield-21-brain-x-brave`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 |  Chou Kasoku Ningen Leo (`.../chou-kasoku-ningen-leo`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 |  Chou Kasoku Ningen Leo (`.../chou-kasoku-ningen-leo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../chou-kasoku-ningen-leo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title= Chou Kasoku Ningen Leo, URL=`.../chou-kasoku-ningen-leo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hyakuro.net/.../Chou_Kasoku_Ningen_Leo_Cover_a243adf246.jpg` (image/jpeg, 24821 bytes, 239x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chou-kasoku-ningen-leo` |  |  |  |
| details thumbnail URL | PASS | `https://hyakuro.net/.../Chou_Kasoku_Ningen_Leo_Cover_a243adf246.jpg` |  |  |  |
| details author | PASS | MATSUBARA Masaru  |  |  |  |
| details artist | PASS | MATSUBARA Masaru  |  |  |  |
| details genres | PASS | Action, Shounen, Supernatural, Oneshot |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 12th Gold Future Cup entry #4. A one-shot about a electrifying super speed human.  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title, artist, author, description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hyakuro.net/.../Chou_Kasoku_Ningen_Leo_Oneshot_By_Hyakuro_Translations_Page_001_505e94d6ca.jpg` (image/jpeg, 399696 bytes, 1654x2339) |  |  |  |
