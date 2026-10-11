# Extension Validation Report

- Extension: tachiyomi-en.bbato-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 1678128543826757763
- Source name: Bbato
- Source language: en
- Selected manga input: popular offset 0: The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Little Alchemist’s Repayment of Gratitude (`.../the-little-alchemists-repayment-of-gratitude`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Serious Villainess Wishes to Be Exiled from the Country (`.../the-serious-villainess-wishes-to-be-exiled-from-the-country`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Narusawa Loves the Face You Make When You Eat (`.../narusawa-loves-the-face-you-make-when-you-eat`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Return of the Scorned Genius, URL=`.../the-return-of-the-scorned-genius` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=The Little Alchemist’s Repayment of Gratitude, URL=`.../the-little-alchemists-repayment-of-gratitude` at page 1 offset 8 and page 2 offset 0, title=Lumberjanes, URL=`.../lumberjanes` at page 1 offset 9 and page 2 offset 1, title=The Unlucky Reincarnate I Reformed My Territory Through Brewing, URL=`.../the-unlucky-reincarnate-i-reformed-my-territory-through-brewing` at page 1 offset 10 and page 2 offset 2, title=I Want a Divorce, but the Stoic Duke Dotes on Me, URL=`.../i-want-a-divorce-but-the-stoic-duke-dotes-on-me` at page 1 offset 11 and page 2 offset 3, title=Eternal Sea, URL=`.../eternal-sea` at page 1 offset 12 and page 2 offset 4, title=Copying Skills with Affinity!, URL=`.../copying-skills-with-affinity` at page 1 offset 13 and page 2 offset 5, title=Yoshimi Iida, Gourmet Delivery Prince, URL=`.../yoshimi-iida-gourmet-delivery-prince` at page 1 offset 14 and page 2 offset 6, title=Finders Keepers, URL=`.../finders-keepers` at page 1 offset 15 and page 2 offset 7, title=Sono Hana no Shiroki Koto..., URL=`.../sono-hana-no-shiroki-koto` at page 1 offset 16 and page 2 offset 8, title=Tasukenaide Mayoriin!, URL=`.../tasukenaide-mayoriin` at page 1 offset 17 and page 2 offset 9, title=Shu-san wa Furimukanai, URL=`.../shu-san-wa-furimukanai` at page 1 offset 18 and page 2 offset 10, title=Sabae is Just a Friend, Maybe, URL=`.../sabae-is-just-a-friend-maybe` at page 1 offset 19 and page 2 offset 11 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.love4awalk.xyz/.../the-return-of-the-scorned-genius.webp` (image/webp (encoding: lossy), 41160 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-return-of-the-scorned-genius` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.love4awalk.xyz/.../the-return-of-the-scorned-genius.webp` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shounen, Fantasy, Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | No synopsis available |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn1.love4awalk.xyz/.../0.webp` (image/webp (encoding: lossy), 681668 bytes, 800x15304; server Content-Type: image/jpeg) |  |  |  |
