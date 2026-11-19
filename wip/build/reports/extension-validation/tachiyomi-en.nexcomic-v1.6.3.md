# Extension Validation Report

- Extension: tachiyomi-en.nexcomic-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3024771939240549070
- Source name: NexComic
- Source language: en
- Selected manga input: latest offset 0: Listen to My Lady's Story: Conquest Record of the Villainess Isabella (`.../listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Reincarnated as the Villainous Orphanage Director Destined to Be Defeated, I Ended Up Being Loved by the Main Heroines’ Daughters (`.../reincarnated-as-the-villainous-orphanage-director-destined-to-be-defeated-i-ended-up-being-loved-by-the-main-heroines-daughters`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Listen to My Lady's Story: Conquest Record of the Villainess Isabella (`.../listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Listen to My Lady's Story: Conquest Record of the Villainess Isabella (`.../listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Listen to My Lady's Story: Conquest Record of the Villainess Isabella (`.../listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Listen to My Lady's Story: Conquest Record of the Villainess Isabella, URL=`listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nexcomic.com/.../avatar.png` (image/png, 2751689 bytes, 1052x1495) |  |  |  |
| details identity | PASS | Details preserved selected URL `listen-to-my-lady-s-story-conquest-record-of-the-villainess-isabella` |  |  |  |
| details thumbnail URL | PASS | `https://nexcomic.com/.../avatar.png` |  |  |  |
| details author | PASS | Gardenia |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Comedy, Ecchi, Fantasy, Harem, Reincarnation, Romance, Royalty, Seinen, Villa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Crow, the young butler serving Baroness Maria, is caught in a trap set by Duchess Isabella, who was trying to teach Baroness Maria a lesson for her bad behavior, and is severely injured. When Crow wakes up, the memories that come flooding back to him are of his past life before being reincarnated into another world—his past life working for a black company. Confused by the differences between his current life and his past life, Crow eventually regains his composure and, upon reassessing his situation, realizes something. In his past life, he suffered unfair treatment at a black company, and even after reincarnation, he is still being manipulated by the arrogant, selfish, and proud Lady Isabella. Eventually, his anger at the accumulated injustice becomes unbearable, and he decides to take revenge by playing naughty tricks on Lady Isabella, but Lady Isabella is easier to manipulate than he thought!? Furthermore, it seems that this world is an otome game where Maria is the main character and Isabella is the villainess... This is a story about a reincarnated butler who, while training his mistress according to his desires, also makes her happy.<br><br>Alternative Titles:<br>ウチのお嬢様の話を聞いてくれ ～悪役令嬢イザベラ攻略記録～<br>UCHI NO OJOUSAMA NO HANASHI WO KIITE KURE ~AKUYAKU REIJOU ISABELLA KOURYAKU KIRO |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://nexcomic.com/.../chapter-1.rsc` to `https://nexcomic.com/.../chapter-1.rsc <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://nexcomic.com/.../0001.jpg <redacted query values: v>` (image/jpeg, 2551843 bytes, 1920x1080) |  |  |  |
