# Extension Validation Report

- Extension: tachiyomi-vi.tulinhtruyen-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5308336236041321626
- Source name: TuLinhTruyen
- Source language: vi
- Selected manga input: popular offset 0: Từ Phù Thủy Mạnh Nhất Khu Ổ Chuột Đến Vô Song Tại Học Viện Pháp Thuật Hoàng Gia (`.../fa3d4fd5-b8b0-49ae-9110-21da7fb76848`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Từ Phù Thủy Mạnh Nhất Khu Ổ Chuột Đến Vô Song Tại Học Viện Pháp Thuật Hoàng Gia (`.../fa3d4fd5-b8b0-49ae-9110-21da7fb76848`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Pháp sư cận chiến (`.../5e691e92-f241-40e8-827f-cb15fa13ec7f`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Tiểu thuyết gia của những vụ mất tích bí ẩn (`.../e55c9d35-e9a7-40cb-9344-f69c40737ebd`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Seinen Shoujo yo, Haru wo Musabore (`.../a0fe802c-f05c-4945-8497-61790cb56479`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Từ Phù Thủy Mạnh Nhất Khu Ổ Chuột Đến Vô Song Tại Học Viện Pháp Thuật Hoàng Gia (`.../fa3d4fd5-b8b0-49ae-9110-21da7fb76848`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 139 | Chương 1.1 (`.../af7cd90c-0d44-4965-a818-fe13c74f43a4`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 500 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.tulinh.workers.dev/.../fa40df42-612d-4058-a01e-8cc80beef099.jpg` (image/jpeg, 130349 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fa3d4fd5-b8b0-49ae-9110-21da7fb76848` |  |  |  |
| details thumbnail URL | PASS | `https://api.tulinh.workers.dev/.../fa40df42-612d-4058-a01e-8cc80beef099.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adaptation, Adventure, Fantasy, Drama, Romance, Magic, Harem, Monsters, Mystery, School Life, Action, Demons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tên khác: 王立魔法学園の最下生～貧困街上がりの最強魔法師、貴族だらけの学園で無双する～; The Irregular of the Royal Academy of Magic: The Strongest Sorcerer from the Slums is Unrivaled in the School of Royals; 로얄아카데미의 불규칙마법~빈민가 출신 최강의 마법사가 로열스 학원에서 타의 추종을 불허합니다~; O irregular da academia real de magia; Младший студент королевской академии магии - сильнейший маг-выскочка из трущоб, которому нет равных среди знати в академии; Самый Сильный Колдун из трущоб не имеет себе равных в Королевской школе магии; El irregular de la real academia de magia ~el hechicero más fuerte de los barrios bajos no tiene rival en la escuela de la realeza ~; Найсильніший чаклун з нетрів не має собі рівних в Королівській школі магії; Ouritsu Mahou Gakuen no Saikasei ~Hinkongai Agari no Saikyou Mahoushi, Kizoku Darake no Gakuen de Musou Suru~<br><br>Áp đảo giới quý tộc, pháp sư mạnh nhất từ ​​khu ổ chuột !!<br>Ars vốn là một thằng ăn cắp vặt trong khu ổ chuột. Và được nhận nuôi để trở thành sát thủ. Ở tuổi 15, Ars được khuyên nên đi học để đủ tiêu chuẩn trở thành "Pháp sư". Vừa bước vào cổng trường, là sự xuất hiện của những quý tộc có trình độ không bằng một cái móng tay của Ars, người đã vượt qua kỳ kiểm tra đầu vào với khả năng vượt trội, bắt đầu một cuộc sống khác thường. Là học sinh vào ban ngày và một sát thủ vào ban đêm!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 139 chapters |  |  |  |
| chapter dates | PASS | 139 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.tulinh.workers.dev/.../0.1.jpg` to `https://lh3.googleusercontent.com/.../0.1.jpg` (1 redirects); popular: `https://api.tulinh.workers.dev/.../fa40df42-612d-4058-a01e-8cc80beef099.jpg` to `https://lh3.googleusercontent.com/.../tulinh_cover_860eba5c-5a0d-4969-b1c4-f8a10bc46893.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://api.tulinh.workers.dev/.../0.1.jpg` (image/jpeg, 451231 bytes, 2000x1000) |  |  |  |
