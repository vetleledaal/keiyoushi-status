# Extension Validation Report

- Extension: tachiyomi-en.todaymanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1147556681248758139
- Source name: TodayManga
- Source language: en
- Selected manga input: popular offset 0: Boku no Hero Academia (`.../boku-no-hero-academia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Boku no Hero Academia (`.../boku-no-hero-academia`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Genkaigoe no Skill wa, Tenseisha ni shika Atsukaenai: Over Limit Skill Holder (`.../genkaigoe-no-skill-wa-tenseisha-ni-shika-atsukaenai-over-limit-skill-holder`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Boku no Hero Academia (`.../boku-no-hero-academia`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boku no Hero Academia (`.../boku-no-hero-academia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 395 | Ch.000 (`.../ch-000`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boku no Hero Academia, URL=`.../boku-no-hero-academia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.todaymanga.com/.../03050a41-be4f-4eb7-9ac2-c6a5c753f063.webp` (image/webp (encoding: lossy), 12660 bytes, 200x314) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boku-no-hero-academia` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.todaymanga.com/.../03050a41-be4f-4eb7-9ac2-c6a5c753f063.webp` |  |  |  |
| details author | PASS | Horikoshi Kouhei |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, School Life, Sci Fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | What would the world be like if 80 percent of the population manifested superpowers called “Quirks” at age four? Heroes and villains would be battling it out everywhere! Being a hero would mean learning to use your power, but where would you go to study? The Hero Academy of course! But what would you do if you were one of the 20 percent who were born Quirkless?<br><br>Middle school student Izuku Midoriya wants to be a hero more than anything, but he hasn’t got an ounce of power in him. With no chance of ever getting into the prestigious U.A. High School for budding heroes, his life is looking more and more like a dead end. Then an encounter with All Might, the greatest hero of them all, gives him a chance to change his destiny…<br><br>(Source: Viz Media) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 395 chapters |  |  |  |
| chapter dates | PASS | 395 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i1.todaymanga.com/.../0.jpg` (image/jpeg, 215148 bytes, 825x1400) |  |  |  |
