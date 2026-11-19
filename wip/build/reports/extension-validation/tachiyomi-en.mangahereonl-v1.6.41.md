# Extension Validation Report

- Extension: tachiyomi-en.mangahereonl-v1.6.41
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 1
- Failed: 1
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
| popular_next | `getPopularManga(2)` | success | 30 | Release That Witch (`.../release-that-witch`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Little Skeleton (`.../little-skeleton`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | hi Izuru Tokoro no Tenshi (`.../hi-izuru-tokoro-no-tenshi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | keiyoushi.b.c: select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>      + CASE<br>          WHEN `s`.`title` = 'Martial Peak' OR `s`.`slug` = 'martial-peak' THEN 1000<br>          ELSE 0<br>        END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3865 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | keiyoushi.b.c: select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>      + CASE<br>          WHEN `s`.`title` = 'Martial Peak' OR `s`.`slug` = 'martial-peak' THEN 1000<br>          ELSE 0<br>        END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | select `s`.`mangaID` as `mangaID`, `s`.`rank` as `rank`, `s`.`title` as `title`, `s`.`slug` as `slug`, `s`.`image` as `image`, `s`.`licenceLevel` as `licenceLevel`, `m`.`isLicensed` as `isLicensed`, `m`.`id` as `id`, `m`.`status` as `status`, `m`.`latestChapter` as `latestChapter`, `m`.`author` as `author`, `m`.`genres` as `genres`, `m`.`isSafe` as `isSafe`, `m`.`createdDate` as `createdDate`, `m`.`updatedDate` as `updatedDate`, (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)<br>      + CASE<br>          WHEN `s`.`title` = 'Martial Peak' OR `s`.`slug` = 'martial-peak' THEN 1000<br>          ELSE 0<br>        END) AS `relevance` from `mh01` as `s` inner join `Manga` as `m` on `s`.`mangaID` = `m`.`id` where `s`.`sourceStatus` = '0' and `m`.`latestChapter` > -1 and (MATCH(`s`.`title`, `s`.`alternativeTitle`) AGAINST ('Martial Peak' IN NATURAL LANGUAGE MODE)) order by `relevance` desc, s.rank ASC limit 30 - Can't find FULLTEXT index matching the column list |  |  |  |
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
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 257583 bytes, 764x1200) |  |  |  |
