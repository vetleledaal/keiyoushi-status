# Extension Validation Report

- Extension: tachiyomi-pt.mrtenzus-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4272456161813617008
- Source name: MR Tenzus
- Source language: pt-BR
- Selected manga input: popular offset 0: Meu Namorado Perfeito (`.../436`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Meu Namorado Perfeito (`.../436`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Você me faz sentir vergonha (`.../608`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Adoro o seu lado safado (`.../9987`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | O casamento clandestino da raposa (`.../5718`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Meu Namorado Perfeito (`.../436`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Meu Namorado Perfeito (`.../436`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Capitulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Meu Namorado Perfeito, URL=`436` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mrtenzus.com/.../12101b95c8d6e1245fd02f1e4cc1875095242689-350x476.jpg` (image/jpeg, 37677 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `436` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mrtenzus.com/.../12101b95c8d6e1245fd02f1e4cc1875095242689.jpg` (image/jpeg, 253775 bytes, 1074x1474) |  |  |  |
| details author | PASS | Waldo |  |  |  |
| details artist | PASS | Waldo |  |  |  |
| details genres | PASS | BDSM, Drama, Hospedagem, Romance, Smut, Yaoi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ahn Cha-woo, o maior colecionador de “parceiros de merda”. Dessa vez, Cha-woo terminou com seu último namorado em menos de seis meses porque ele o traiu. Por que nenhum de seus relacionamentos dá certo? Será que é ganância querer um namorado legal, bonito, em forma e com um pau grande? Cha-woo se sente infeliz com sua vida.<br><br><br><br>“Ah, deixa pra lá, vou simplesmente esquecer os namoros.”<br><br><br><br>Nesse momento de desespero, a atenção de Cha-woo é atraída por Nam Do-ha, um cara novo que é bonito, atlético e… você sabe o quê! Tudo bem, mas ele provavelmente é um heterossexual popular, então, sim… Cha-woo ia descartar rapidamente sua atração por Do-ha, mas…?<br><br>“Uau! É mesmo? Você pode me pagar o almoço amanhã?”<br><br>Será que ele está mordendo mais do que pode mastigar? Talvez, apenas talvez, desta vez seja diferente?!<br><br>Nomes alternativos: 내 완벽한 남자친구 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://mrtenzus.com/.../0.png` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
