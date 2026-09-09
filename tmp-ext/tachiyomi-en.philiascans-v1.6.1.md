# Extension Validation Report

- Extension: tachiyomi-en.philiascans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5404809838386240671
- Source name: Philia Scans
- Source language: en
- Selected manga input: popular offset 0: Starting a Bakery in Another World Using Recipes from My Past Life! (`.../starting-a-bakery-in-another-world-using-recipes-from-my-past-life`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Starting a Bakery in Another World Using Recipes from My Past Life! (`.../starting-a-bakery-in-another-world-using-recipes-from-my-past-life`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Machino-san, Waiting for a Comeback (`.../machino-san-waiting-for-a-comeback`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | I Reincarnated as a Villainous Noble Fated to Lose, but Got Obsessed with Magic (`.../i-reincarnated-as-a-villainous-noble-fated-to-lose-but-got-obsessed-with-magic`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Reincarnated as the Stepsister My Oshi Dotes On (`.../reincarnated-as-the-stepsister-my-oshi-dotes-on`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Starting a Bakery in Another World Using Recipes from My Past Life! (`.../starting-a-bakery-in-another-world-using-recipes-from-my-past-life`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Starting a Bakery in Another World Using Recipes from My Past Life! (`.../starting-a-bakery-in-another-world-using-recipes-from-my-past-life`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Starting a Bakery in Another World Using Recipes from My Past Life!, URL=`starting-a-bakery-in-another-world-using-recipes-from-my-past-life` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=When I Tried to Conquer the School Princesses, It Turned Into Romantic Mayhem, URL=`when-i-tried-to-conquer-the-school-princesses-it-turned-into-romantic-mayhem` at page 1 offset 19 and page 2 offset 19 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://philiascans.org/.../4f69ee62ab14d59c.jpg <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 240596 bytes, 1060x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `starting-a-bakery-in-another-world-using-recipes-from-my-past-life` |  |  |  |
| details thumbnail URL | PASS | `https://philiascans.org/.../4f69ee62ab14d59c.jpg <redacted query values: token, expires, and v>` |  |  |  |
| details author | PASS | Kushida Kokoro |  |  |  |
| details artist | PASS | Satsuki Nico |  |  |  |
| details genres | PASS | Fantasy, Romance, Shoujo, Slice of Life, Magic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | "Would you like to work as a baker in this mansion?" Charona was kicked out of the party for being useless and had nowhere to go. However, she was saved by the owner of a certain mansion, and her bread-making skills, which she made use of her memories from her past life, were recognized, and she was made to work as a baker! A cooking life in another world, spent with a cute spirit and a handsome husband! "I'll make delicious bread for everyone!"<br><br>Alternative Titles:<br>- 追放されたので、前世のレシピでパン職人はじめます！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://philiascans.org/.../a2d4ff28f21fa525b763ec9625999757ba5e1344c920539bea76a75a9b8fe1ed_s.webp <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 468872 bytes, 1062x1500) |  |  |  |
