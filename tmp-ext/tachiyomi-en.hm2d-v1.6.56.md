# Extension Validation Report

- Extension: tachiyomi-en.hm2d-v1.6.56
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
- Source ID: 7329798563365402763
- Source name: HM2D
- Source language: en
- Selected manga input: popular offset 0: Ponpharse (`.../132652`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Ponpharse (`.../132652`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Loli to Asobo♪ (`.../156888`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Otouto Omochikaeru (`.../157153`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Niku no Bloomer wa Kuikomisugite Eroi! (`.../129333`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ponpharse (`.../132652`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ponpharse (`.../132652`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 0 - Female Teacher vol1 (`.../chapter-0-female-teacher-vol1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ponpharse, URL=`132652` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://3r21zkocdpp9f.doujindistrict.com/.../3b922393a3cb462762ff5dd2bec1b20f.jpg` (image/jpeg, 12415 bytes, 400x291) |  |  |  |
| details identity | PASS | Details preserved selected URL `132652` |  |  |  |
| details thumbnail URL | PASS | `https://3r21zkocdpp9f.doujindistrict.com/.../3b922393a3cb462762ff5dd2bec1b20f.jpg` |  |  |  |
| details author | PASS | Ponfaz |  |  |  |
| details artist | PASS | Ponfaz |  |  |  |
| details genres | PASS | Blowjob, Breast Sucking, Defloration, Full Color, Group Sex, Handjob, Incest, Large Breasts, Licking, Maid, Mother, Multi-Part, Straight Shota, Teacher, Nurse, Small Penis, Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ponpharse<br><br>Parody: Original.<br><br>Alternative Names: Ponpharse vol.1 - Female Teacher / ぽんふぁーずvol.1「女教師」編・修正版, Ponpharse vol.2 - Yoko / ぽんふぁーず vol.2 ｢ヨーコ｣, Ponpharse vol.3 - Older Woman / ぽんふぁーず vol.3 ｢年上のおねえさん｣, Ponpharse vol.4 - Nurse / ぽんふぁーず vol.4 ｢ナース｣, Ponpharse vol.5 - Naughty Woman / ぽんふぁーずvol.5「悪女」編, Ponpharse vol.6 - Mother / ぽんふぁーずvol.6「ママ」編, Ponpharse vol.7 / ぽんふぁーずvol.7, Ponpharse Vol. 8 - "Yuuwaku -Futari dake no Himitsu-" Hen PART1 \| Ponpharse Vol. 8 - Seduction - A Secret Between the Two of Us - / ぽんふぁーずvol.8「誘惑‐二人だけの秘密‐」編, Ponpharse`s Special / ぽんふぁーず「特別編」, Ponpharse`s Special 2 / ぽんふぁーず特別編2, Ponpharse - Short story compilation works / ぽんふぁーず短編作品集, Ponpharse for Mobile vol.1 - Teacher Sister / ぽんふぁーず for Mobile vol.1 「家庭教師のおねえさん」編 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | All 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://3r21zkocdpp9f.doujindistrict.com/.../00.png` (image/jpeg, 66007 bytes, 900x656; server Content-Type: image/png) |  |  |  |
