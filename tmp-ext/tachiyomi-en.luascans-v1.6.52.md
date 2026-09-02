# Extension Validation Report

- Extension: tachiyomi-en.luascans-v1.6.52
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 972271455406675873
- Source name: Lua Scans
- Source language: en
- Selected manga input: popular offset 0: I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | The Villainess Hides Her Wealth (`.../the-villainess-hides-her-wealth`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | I Stole the Trash Crown Prince’s First Night (`.../i-stole-the-trash-crown-princes-first-night`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | I Returned Thinking It Was the Ending, But the Genre Changed (`.../i-returned-thinking-it-was-the-ending-but-the-genre-changed`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 161 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Need to Raise My Sister Properly, URL=`.../i-need-to-raise-my-sister-properly` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=I Stole the Trash Crown Prince’s First Night, URL=`.../i-stole-the-trash-crown-princes-first-night` at page 1 offset 0 and page 2 offset 5, title=I Returned Thinking It Was the Ending, But the Genre Changed, URL=`.../i-returned-thinking-it-was-the-ending-but-the-genre-changed` at page 1 offset 1 and page 2 offset 0, title=The Notorious Couple Trade Places, URL=`.../the-notorious-couple-trade-places` at page 1 offset 2 and page 2 offset 8, title=The Perks of Being a Villainess, URL=`.../the-perks-of-being-a-villainess` at page 1 offset 4 and page 2 offset 1, title=Marked as the Tyrant’s Daughter-in-law, URL=`.../marked-as-the-tyrants-daughter-in-law` at page 1 offset 6 and page 2 offset 2, title=Writing My Male Lead’s Happily Ever After, URL=`.../writing-my-male-leads-happily-ever-after` at page 1 offset 7 and page 2 offset 4, title=I’m a Fairy, Not a Saintess, URL=`.../im-a-fairy-not-a-saintess` at page 1 offset 8 and page 2 offset 9, title=The Arrogant Young Lady Learns Love Through a Blood Pact, URL=`.../the-arrogant-young-lady-learns-love-through-a-blood-pact` at page 1 offset 10 and page 2 offset 10 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` (image/webp (container: extended), 391454 bytes, 1048x1501) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-need-to-raise-my-sister-properly` |  |  |  |
| details thumbnail URL | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Transported into a novel as the villain's half-sister, she vows to change their tragic fate. But her plans derail when she catches the attention of the terrifying "Blood Duke," who denies having feelings yet acts like a jealous boyfriend. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 39 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name |  |  |  |
| chapters | PASS | 161 chapters |  |  |  |
| chapter dates | PASS | 161 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.luacomic.org/.../001.webp` (image/webp (encoding: lossy), 37420 bytes, 720x1199; server Content-Type: image/jpg) |  |  |  |
