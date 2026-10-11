# Extension Validation Report

- Extension: tachiyomi-en.qiscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: ezmanhwa
- Source ID: 5806040666300479660
- Source name: QiScans
- Source language: en
- Selected manga input: popular offset 0: Eleceed (`.../4190634673-eleceed`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Eleceed (`.../4190634673-eleceed`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Mysterious World’s Greatest Martial Artist Little Prince (`.../4190634673-the-mysterious-worlds-greatest-martial-artist-little-prince`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Genius Martial Artist Who Remembers Everything (`.../the-genius-martial-artist-who-remembers-everything`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Sergeant's Dragon (`.../the-sergeants-dragon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Eleceed (`.../4190634673-eleceed`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eleceed (`.../4190634673-eleceed`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 403 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 107 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eleceed, URL=`4190634673-eleceed` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.qimanhwa.com/.../1777389617457-l8Rwb5-19274.webp` (image/webp (encoding: lossy), 215732 bytes, 1380x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `4190634673-eleceed` |  |  |  |
| details thumbnail URL | PASS | `https://media.qimanhwa.com/.../1777389617457-l8Rwb5-19274.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, superpower |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jiwoo is a kind-hearted young man who harnesses the lightning quick reflexes of a cat to secretly make the world a better place – one saved little child or foster pet at a time. Kayden is a secret agent on the run, who finds himself stuck in the body of a…um…decidedly fat old fluffy cat. Together, armed with Jiwoo’s super powers and Kayden’s uber-smarts, they’re out to fight those forces who would let evil rule this world. That is, if they can stand each other long enough to get the job done.Kaiden – A mysterious ability user who hides inside the body of a street cat. He is later picked up by Jiwoo after being injured after a fight with another ability user. He has a stubborn and bossy personality. Jiwoo – an energetic and talkative high school boy who loves cats. e is very kind and also seem to have a special ability.<br><br>Alternative Titles: 일렉시드 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 403 chapters |  |  |  |
| chapter dates | PASS | 403 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 107 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.qimanhwa.com/.../0.webp` (image/webp (encoding: lossy), 39844 bytes, 700x1000) |  |  |  |
