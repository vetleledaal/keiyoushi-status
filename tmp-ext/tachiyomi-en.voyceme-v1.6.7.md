# Extension Validation Report

- Extension: tachiyomi-en.voyceme-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4815322300278778429
- Source name: VoyceMe
- Source language: en
- Selected manga input: popular offset 0: God Game (`.../god-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | God Game (`.../god-game`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | S+ Criminal Lord (`.../s-criminal-lord`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | 2 soccer men  (`.../2-soccer-men`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Heartless (`.../heartless`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | God Game (`.../god-game`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | God Game (`.../god-game`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 135 | Episode 1 - Survive (`.../1552`) |  | <1s |
| pages | `getPageList(chapter)` | success | 108 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=God Game, URL=`.../god-game` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dlkfxmdtxtzpb.cloudfront.net/.../wr9AIuORV0ZcVjMkj89qlATbvkLk5sdLdvonyq6t.jpeg` (image/png, 342418 bytes, 372x496; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../god-game` |  |  |  |
| details thumbnail URL | PASS | `https://dlkfxmdtxtzpb.cloudfront.net/.../wr9AIuORV0ZcVjMkj89qlATbvkLk5sdLdvonyq6t.jpeg` |  |  |  |
| details author | PASS | inspired.author |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reiyan Asura, if that is his real name, awakens in a void, bound by chains. He doesn't remember who he is or how he arrived in this world of white. Little does he know, he's been entered with millions of others in a twisted game where only the strongest prevail. Reiyan is anything but strong, but does he have a buried secret that can help him survive? Welcome to the God Game. Prove your worth or die entertaining Him. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 90 name, chapter 103 name, chapter 104 name, chapter 114 name, chapter 119 name, chapter 121 name, chapter 123 name |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | PASS | 135 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 108 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dlkfxmdtxtzpb.cloudfront.net/.../1552_pG5F8cyZW7DFXkZtFzKqFLBOqJYmMWumK9j2k0q3.jpeg` (image/png, 183718 bytes, 800x1440; server Content-Type: image/jpeg) |  |  |  |
