# Extension Validation Report

- Extension: tachiyomi-all.femjoyhunter-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: masonry
- Source ID: 9185590742756804817
- Source name: Femjoy Hunter
- Source language: all
- Selected manga input: popular offset 0: Cheerleader (`.../emma-a-in-cheerleader`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Cheerleader (`.../emma-a-in-cheerleader`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Reflection (`.../naomi-a-in-reflection`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Tanya Ray in Femjoy Debut from Femjoy (`.../tanya-ray-in-femjoy-debut`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Julia Morozzi in Flirty Night from Femjoy (`.../julia-morozzi-in-flirty-night`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Cheerleader (`.../emma-a-in-cheerleader`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cheerleader (`.../emma-a-in-cheerleader`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../emma-a-in-cheerleader`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cheerleader, URL=`.../emma-a-in-cheerleader` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.femjoyhunter.com/.../2606864_masonry_1200.jpg` (image/jpeg, 367819 bytes, 1200x1799) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../emma-a-in-cheerleader` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Emma A |  |  |  |
| details artist | PASS | Emma A, Model |  |  |  |
| details genres | PASS | Asshole, Cute, Feet, Legs, Outdoor, Pale, Pussy, Redhead, Skirt, Teen, Model, Perfect Teen Body, Posing |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[Emma A\](https://www.femjoyhunter.com/.../emma-a)\[Asshole\](https://www.femjoyhunter.com/.../asshole) \[Cute\](https://www.femjoyhunter.com/.../cute) \[Feet\](https://www.femjoyhunter.com/.../feet) \[Legs\](https://www.femjoyhunter.com/.../legs) \[Outdoor\](https://www.femjoyhunter.com/.../outdoor) \[Pale\](https://www.femjoyhunter.com/.../pale) \[Pussy\](https://www.femjoyhunter.com/.../pussy) \[Redhead\](https://www.femjoyhunter.com/.../redhead) \[Skirt\](https://www.femjoyhunter.com/.../skirt) \[Teen\](https://www.femjoyhunter.com/.../teen) \[Model\](https://www.femjoyhunter.com/.../model) \[Perfect Teen Body\](https://www.femjoyhunter.com/.../perfect-teen-body) \[Posing\](https://www.femjoyhunter.com/.../posing) \[\+ All Tags\](https://www.femjoyhunter.com/.../emma-a-in-cheerleader)\[\- Less Tags\](https://www.femjoyhunter.com/.../emma-a-in-cheerleader) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.femjoyhunter.com/.../0007-01_1200.jpg` (image/jpeg, 407717 bytes, 1200x1799) |  |  |  |
