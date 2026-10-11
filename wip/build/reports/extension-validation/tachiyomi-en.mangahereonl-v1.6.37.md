# Extension Validation Report

- Extension: tachiyomi-en.mangahereonl-v1.6.37
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangahub
- Source ID: 3901872639081578162
- Source name: MangaHere.onl
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Release That Witch (`.../release-that-witch`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Trinity Seven (`.../trinity-seven`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Myth of Chinese Monsters (`.../myth-of-chinese-monsters`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | keiyoushi.b.c: select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>              + CASE<br>                  WHEN `s`.`title` = 'Martial Peak' THEN 1000<br>                  ELSE 0<br>                END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3865 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | keiyoushi.b.c: Chapter encryption unavailable | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | keiyoushi.b.c: select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>              + CASE<br>                  WHEN `s`.`title` = 'Martial Peak' THEN 1000<br>                  ELSE 0<br>                END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | keiyoushi.b.c: Chapter encryption unavailable | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>              + CASE<br>                  WHEN `s`.`title` = 'Martial Peak' THEN 1000<br>                  ELSE 0<br>                END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../martial-peak.jpg` (image/jpeg, 43584 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../martial-peak.jpg` |  |  |  |
| details author | PASS | Momo (莫默); Pikapi (噼咔噼) |  |  |  |
| details artist | PASS | Pikapi (噼咔噼) |  |  |  |
| details genres | PASS | Action, Adventure, Wuxia, Fantasy, Martial Arts, Harem, Supernatural, Sexual Violence, Long Strip, Adaptation, Full Color, Suggestive |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The peak of martial arts is solitary and lonely. It is an endless pursuit for unattainable heights as well. In order to surpass the limits of martial arts, growth and the will to survive in adverse situations is necessary.<br>One day, Yang Kai, a disciple-on-trial (and floor sweeper) of the Lingxiao Martial Arts Sect discovered a Wordless Black Book. That marked the turn in his luck and the beginning of his martial arts journey. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3865 chapters |  |  |  |
| chapter dates | PASS | 3865 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Chapter encryption unavailable |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
