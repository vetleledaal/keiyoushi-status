# Extension Validation Report

- Extension: tachiyomi-en.kaynscans-v1.6.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6622233282902198923
- Source name: Kayn Scans
- Source language: en
- Selected manga input: popular offset 0: The Poison Master Of Sichuan Tang Clan (`.../kayn-s-54`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Poison Master Of Sichuan Tang Clan (`.../kayn-s-54`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I Became a wizard in a Medieval Fantasy World (`.../kayn-s-193`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Wind Mage (`.../kayn-s-338`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Lord Who Levels Up by Absorbing Powers (`.../cmthmarz2057lkvs8oopptlub`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Poison Master Of Sichuan Tang Clan (`.../kayn-s-54`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Poison Master Of Sichuan Tang Clan (`.../kayn-s-54`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 101 | Chapter 1 (`.../kayn-c-1665`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Poison Master Of Sichuan Tang Clan, URL=`kayn-s-54` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kaynscans.com/.../4611d590888449c756db95b6b288dd63.png` (image/png, 862652 bytes, 800x1038) |  |  |  |
| details identity | PASS | Details preserved selected URL `kayn-s-54` |  |  |  |
| details thumbnail URL | PASS | `https://kaynscans.com/.../4611d590888449c756db95b6b288dd63.png` |  |  |  |
| details author | PASS | Kayn Scans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Action, Comedy, Fantasy, Martial Arts, Romance, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fabre, a famous million-viewer streamer known for his daring encounters with venomous creatures, is bitten by a black mamba while filming in Africa and wakes up in the mystical world of Murim. To his surprise, the jungles of Murim offer him a peaceful farming life in which he enjoys cultivating various poisonous species. But his tranquility is short-lived when he crosses paths with members of the Tang Clan, the masters of poison and devious tactics. "I see potential in you.<br><br>Rating: 10.0<br>Type: MANHWA<br>Origin: KOREAN<br><br>Alternative titles: <br>- 파브르 in 사천당가<br>- A Poison Master in the Sichuan Tang Clan<br>- El maestro del veneno del Clan Tang Sichuan<br>- Entomologist in Sichuan Tang Clan<br>- Fabre in Sacheon Tang Clan<br>- Fabre in Sacheondangga<br>- Poison Entomologist In Sichuan Tang Clan<br>- The Poison Master of Sacheon Tang Clan<br>- The Poison Master of Sacheondang Clan<br>- เซียนพิษท่องยุทธภพ<br>- 唐家的养蛊师<br>- 武林界のファーブルは毒物博士<br>- 毒物專家法布爾in四川唐門<br>- The Sichuan Tang Clan's Entomologist |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kaynscans.com/.../p0003.jpg` (image/webp (container: extended), 205832 bytes, 700x7014; server Content-Type: image/jpeg) |  |  |  |
