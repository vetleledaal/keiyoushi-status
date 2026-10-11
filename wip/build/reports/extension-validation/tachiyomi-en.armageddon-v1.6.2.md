# Extension Validation Report

- Extension: tachiyomi-en.armageddon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3696994059835859589
- Source name: SilentQuill
- Source language: en
- Selected manga input: popular offset 0: My Life Turned Around: After Being Cheated on and Falsely Accused, I Ended up Being Adored by the Most Beautiful Girl in School (`.../my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | My Life Turned Around: After Being Cheated on and Falsely Accused, I Ended up Being Adored by the Most Beautiful Girl in School (`.../my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Using crafting skills to completely transform a deserted island in another world! ...Or so I thought, but there are native inhabitants who seem to be after my seed. (`.../using-crafting-skills-to-completely-transform-a-deserted-island-in-another-world-or-so-i-thought-but-there-are-native-inhabitants-who-seem-to-be-after-my-seed`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | My Childhood Friend Is Always Down Whenever I Make a Move (`.../my-childhood-friend-is-always-down-whenever-i-make-a-move`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | My Life Turned Around: After Being Cheated on and Falsely Accused, I Ended up Being Adored by the Most Beautiful Girl in School (`.../my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Life Turned Around: After Being Cheated on and Falsely Accused, I Ended up Being Adored by the Most Beautiful Girl in School (`.../my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | Chapter 1 (`.../3462`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Life Turned Around: After Being Cheated on and Falsely Accused, I Ended up Being Adored by the Most Beautiful Girl in School, URL=`my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://silentquill.net/.../aHR0cHM6Ly9zaWxlbnRxdWlsbC5uZXQvd3AtY29udGVudC91cGxvYWRzLzIwMjUvMDgvNzQ2MTgzNTk2ODExLndlYnA <redacted query values: w>` (image/webp (encoding: lossy), 28546 bytes, 320x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `my-life-turned-around-after-being-cheated-on-and-falsely-accused-i-ended-up-being-adored-by-the-most-beautiful-girl-in-school` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://silentquill.net/.../aHR0cHM6Ly9zaWxlbnRxdWlsbC5uZXQvd3AtY29udGVudC91cGxvYWRzLzIwMjUvMDgvNzQ2MTgzNTk2ODExLndlYnA` (image/webp (encoding: lossy), 370840 bytes, 1792x2400) |  |  |  |
| details author | PASS | D (II) |  |  |  |
| details artist | PASS | IKAGUCHI Ei |  |  |  |
| details genres | PASS | Drama, Romance, School Life, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | At the end of summer, Eiji Aono witnesses his childhood friend and girlfriend, Miyuki Amada, cheating on him with Kondo, the ace of the soccer team. Betrayed by her and emotionally shattered, Eiji becomes the target of baseless slander and harassment. Cornered and with nowhere to turn, he escapes to the school rooftop—where he meets a mysterious girl... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://silentquill.net/.../25932-i9cbLKh-Msy1TfUD` (image/webp (encoding: lossy), 135458 bytes, 1284x1843) |  |  |  |
