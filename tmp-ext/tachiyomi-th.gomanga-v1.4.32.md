# Extension Validation Report

- Extension: tachiyomi-th.gomanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 748167751985747523
- Source name: Go Manga
- Source language: th
- Selected manga input: latest offset 0: Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี (`.../swordmanship-veteran-stream`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Nano Machine นาโนมาชิน (`.../nano-machine`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | God-level Assassin, I Am the Shadow นักฆ่าระดับเทพ ข้าคือเงามืด (`.../god-level-assassin`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี (`.../swordmanship-veteran-stream`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Reincarnator’s Stream การไลฟ์สดของผู้หวนคืน (`.../reincarnators-stream`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี (`.../swordmanship-veteran-stream`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี (`.../swordmanship-veteran-stream`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 35 | ตอนที่ 1 (`.../swordmanship-veteran-stream-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี, URL=`.../swordmanship-veteran-stream` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.go-manga.com/.../Swordmanship-Veterans-Game-Stream.jpg` (image/jpeg, 57949 bytes, 350x501) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../swordmanship-veteran-stream` |  |  |  |
| details thumbnail URL | PASS | `https://www.go-manga.com/.../Swordmanship-Veterans-Game-Stream.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Martial arts, Shounen, ตลก, ผจญภัย, พระเอกเทพ, มังงะเกาหลี, ระบบ, ศิลปะการต่อสู้-แอคชั่น, แฟนตาซี, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Swordmanship Veteran’s Game Stream เทพดาบขั้นเซียนมาเปิดสตรีมโชว์ตบไก่ในเกมแฟนตาซี มังงะแปลไทย “การเป็นเทพดาบในชาติที่แล้วมีประโยชน์อะไรเหรอ?” ฉันไม่รู้ว่าทำไม แต่ฉันจำชาติที่แล้วตอนเด็กได้ นั่นอาจเป็นเหตุผลที่ฉันชอบเกมเสมือนจริงที่เคยเล่นมาก ๆ ก็ได้? อย่างไรก็ตาม ปัญหาทางพันธุกรรมทำให้ฉันไม่สามารถเข้าถึงโลกเสมือนจริงได้ และต้องใช้เวลาถึงเจ็ดปีถึงจะมีวิธีแก้ไข “แคปซูลราคาหนึ่งร้อยล้านวอน” แพงจัง “ที่จริง คุณเคยได้ยินเกี่ยวกับ LEOS ไหม?” ลีกแห่งการสตรีม? การแข่งขันของสตรีมเมอร์? ทำไมถึงพูดถึงล่ะ? “รางวัลใหญ่คือแคปซูลนี้แหละ คุณคิดยังไง? อยากลองดูไหม?”<br><br>Alternative Names: Swordmanship Veteran's Game Stream, Sword God's Livestream, The Veteran Swordmaster's Stream, 검술 고인물의 게임방송 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | LINT | All 35 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=35 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.go-manga.com/.../101.jpg` (image/webp (encoding: lossy), 597490 bytes, 720x9318) |  |  |  |
